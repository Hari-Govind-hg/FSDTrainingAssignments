var same=0;

const saveUser = ()=>{
    const userObj = {
        id: 1,
        name: document.getElementById('name').value,
        age: parseInt(document.getElementById('age').value),
        salary: parseInt(document.getElementById('salary').value)
    };
    // save string object in store
    
    // available with in a tab
    // sessionStorage.setItem(user.id, JSON.stringify(user));

    // available across all the tabs in a browser till the lifecycle

    //console.log(localStorage.getItem('users'));
    let users = [];
    

    if(localStorage.getItem('users') != null){
        // append to the existing array
        // console.log(edited);
        if(edited==1){
            // console.log(index);
        users.splice(index-1,1,userObj);
        localStorage.setItem('users',JSON.stringify(users));
        edited=0;
        renderTable(users);
        }
        else{
            users = JSON.parse(localStorage.getItem('users'));
            users.forEach(u=>{
                if(u.name==userObj.name)
                {
                    same=1;
                    // console.log("Same Name Detected");
                }
            });
            if(same==0){
                console.log(same);
                users.push(userObj);
                localStorage.setItem('users',JSON.stringify(users));
            }
            else if(same==1)
            {
                console.log("Same Name Detected");
                document.getElementById("err").innerHTML="<h3>Same Name Detected,Duplicates not allowed<h3>"
                same=0;
            }
        }
    }
    else{
        // create the array
        // add a new object
            users.push(userObj);
            localStorage.setItem('users',JSON.stringify(users));
    }
}

const findById = (id)=>{
    let users = [];
    if(localStorage.getItem('users')!=null){
        users=JSON.parse(localStorage.getItem('users'));
    }
}

//Function to delete the entry
function del(name){
    nm=name.toString();
    let users = [];
    var index=0;
    if(localStorage.getItem('users')!=null){
        users=JSON.parse(localStorage.getItem('users'));
        users.forEach(u=>{
            if(u.name==nm){
                users.splice(index,1);
                console.log(users);
            }
            index++;
        });
        localStorage.clear();
        localStorage.setItem('users',JSON.stringify(users));
        renderTable(users);
    }
}

var index;
var edited=0;
function ed(name){
    edited=1;
    nme=name.toString();
    let users = [];
    index=0;
    if(localStorage.getItem('users')!=null){
        users=JSON.parse(localStorage.getItem('users'));
        users.forEach(u=>{
            if(u.name==nme){
                document.getElementById('name').value=u.name;
                document.getElementById('age').value=u.age;
                document.getElementById('salary').value=u.salary;
                console.log(users);
            }
            index++;
        })
    }
}

const getAll = () =>{
    let users = [];
    if(localStorage.getItem('users') !=null){
        users = JSON.parse(localStorage.getItem('users'));
        renderTable(users);
    }else{
        document.getElementById('emps').innerHTML = '<strong>No Records Found</strong>';
    }
}

const renderTable = (users)=>{
    const rows = renderRows(users);
    document.getElementById('emps').innerHTML = `<table>
                                                    <tr>
                                                        <th>Employee Details</th>
                                                    </tr>
                                                    ${rows}
                                               </table>`;
}

const renderRows = (users) =>{
    let rows = '';
    users.forEach(e=>{
        rows += `<tr>
                    <td> =><i> NAME :${e.name}, SALARY : ${e.salary}, AGE : ${e.age} </i>
                    <a href="#" onclick='del("${e.name}")'>Delete Me!</a>
                    <a href="#" onclick='ed("${e.name}")'>Edit Me!</a>
                    </td>
                </tr>`;
    });
    return rows;
}

