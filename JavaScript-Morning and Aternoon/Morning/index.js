
function anyNumber() {
    let num = ['0','1','2','3','4','5','6','7','8','9'];
    let str = document.getElementById("string").value;
    console.log(str);
    let i;
    for(i = 0; i<str.length; i++) {
        if(num.includes(str.charAt(i))) { 
            document.getElementById("anynumber").innerHTML = "The string has numbers.";
        } 
        else
           document.getElementById("anynumber").innerHTML = "The string has no numbers."; 
    }
}

function lengthofstr() 
{
    document.getElementById("lengthofstr").innerHTML = "Length of the string is " + document.getElementById("string").value.length + ".";
}

function lowerandupper()
{
    document.getElementById("lowerstr").innerHTML =  "Lower Case: " + document.getElementById("string").value.toLowerCase();
    document.getElementById("upperstr").innerHTML =  "Upper Case: " + document.getElementById("string").value.toUpperCase(); 
}

function vowelsandconsonants()
{
    let vowels = [];
    let consonants = [];
    let other = [];
    let vow = ['a','e','i','o','u','A','E','I','O','U'];
    let num = ['0','1','2','3','4','5','6','7','8','9'];
    let str = document.getElementById("string").value;
    let i;
    let len = str.length;
    for(i = 0; i<len; i++){
        let x = str.charAt(i);
        if(vow.includes(x)) vowels.push(x);
        if(num.includes(x)) other.push(x);
        else consonants.push(x);
    }

    document.getElementById("vowels").innerHTML = "Vowels are - " + vowels + ".";
    document.getElementById("consonants").innerHTML = "Consonants are - " + consonants + ".";
    document.getElementById("others").innerHTML = "Other Characters are " + other + "."
    
}
