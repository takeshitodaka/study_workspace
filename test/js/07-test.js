const a = {
    name :"John",
    score1 :47,
    score2 :46,
    passed : false,
    degree : ''
}
const b = {
    name :"Bob",  
    score1 :23,
    score2 :24,
    passed : false,
    degree : ''
}
const c = {
    name :"Nick", 
    score1 :40,
    score2 :35,
    passed : false,
    degree : ''
}
const d = {
    name :"Alex", 
    score1 :44,
    score2 :45,
    passed : false,
    degree : ''
}

const students = [a,b,c,d] 
const degrees = ["A","B","C","D","E"]
const limits = [91,81,71,61,51]        


function score(){
    for(let i =0; i <= students.length-1; i++){ 

      students[i].total = students[i].score1 + students[i].score2

    }
    return students
}


 
function passing(){
    
    for(let i = 0; i <= students.length-1; i++){
        for(let j = 0; j <= limits.length-1 ; j++){
            if(students[i].total >= limits[j]){
                students[i].passed = true
                students[i].degree = degrees[j]
                console.log(students)
                break
            }

        }       

    }

}

function printOut(){
    for(let i = 0; i <=students.length -1; i++){
        if(students[i].passed){
            console.log(students[i].name + " passed the exam! he got the "+ students[i].degree + " grade!!")
        }else{
            console.log(students[i].name + " didn't pass the exam... ")
        }
    }

}

score()
passing()
printOut()
