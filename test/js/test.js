// // var test = "grobal Scope"
// // var test = "global Scope 2 "
// let test = "grobal Scope"
// // let test = "global Scope 2 "

// const testObject = {
//     test: "block Scope"
// }

// function testFunction(){
//     var test = "functionScope"
//     return test
// }

// console.log(test)
// console.log(testObject.test)
// console.log(testFunction())

var score1 = 90;
var score2 = 95;
var highScore1 =75;
var highScore2 =95;

var comparison = (score1+score2) > (highScore1 + highScore2);
console.log('New high score: ' + comparison);