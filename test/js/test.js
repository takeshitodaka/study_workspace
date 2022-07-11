function removeDupes(str){
    
    for(let i=0; i<str.length; i++){
        
        if(str.indexOf(str.charAt(i),i+1) != -1){
            let str1 = str.substr(0,i+1)
            let str2 = str.substr(i+1,str.length)
            
            str2 = str2.replaceAll(str.charAt(i),'')
            
            str=str1+str2
        }
    }
    return str
    
}
console.log(removeDupes('aabbccdd'))
console.log(removeDupes('abcd'))
console.log(removeDupes('abcdabcd'))
console.log(removeDupes('abazzzzcdcd'))

// function productOfArray(arr){
    
//      if (arr.length==2) return arr[0]*arr[1]

    
//     let arr2 = Array.from(arr)
//     arr2.shift()
//     arr[0]= arr[0] * (productOfArray(arr2))
    
//     return arr[0]
// }
// console.log(productOfArray([1,2,3]))
// console.log(productOfArray([1,2,3,10]))

// function isPalindrome(str){
//     if(str.length ===0 ||str.length ===1) return true
//     if(str.charAt(0) != str.charAt(str.length-1)) return false
    
//    return isPalindrome(str.slice(1,str.length-1))  

// }

// console.log(isPalindrome('awesome'))
// console.log(isPalindrome('foobar'))
// console.log(isPalindrome('tacocat'))
// console.log(isPalindrome('amanaplanacanalpanama'))
// console.log(isPalindrome('amanaplanacanalpandemonium'))

// function swapValue(a,b){
//     if(a > b){
//         b = a - b
//         a = a - b
//         b = a + b
//     }else if (b > a){
//         a = b - a
//         b = b - a
//         a = b + a
//     }
//     return [a,b]
// }

// console.log(swapValue(8,2));


// function getMultiplicationTable(x,y){
//     let printStr =""
//     for(let i=1; i <= x; i++){
//         if(i==1) printStr= 'x'
//         printStr = printStr + `\t[${i}]`
//     }
    
//     for(let j=1; j<=y ; j++){
//         printStr = printStr + `\n`
//         for(let k = 1; k<=x; k++){
//             if(k===1) printStr = printStr + `[${j}]`
//             printStr = printStr + `\t${j*k}`
//         }
//     }

//     return printStr
// }
// console.log(getMultiplicationTable(10,10))


// function countPrimes(n){
//     if(n===0 || n===1) return 0
//     if(n===2) return 1
//     counter =0
//     for(i=2; i<=n; i++){
//         for(j=2;j<=i;j++){
//             if(i%j==0 && i!=j) break
//             if(i==j) counter++
//         }
//     }
//     return counter
// }
// console.log(countPrimes(2000))