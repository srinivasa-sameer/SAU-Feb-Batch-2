
retrieve = () => {

    let roll = document.getElementById("rollnumber").value;
    if(student.rollno===roll){
        document.getElementById("details").innerHTML = `
        
        The retrieved details are: 
        Name : ${student.firstname}  ${student.lastname} 
        Age : ${student.age} 
        DOB : ${student.dob} 
        Gender : ${student.gender}
        Roll Numebr : ${student.rollno}
        Occupation : ${student.occupation} 
        `;
    }
    else{
        document.getElementById("details").innerHTML = "No details found";
    }
    
}