console.log("Rombo normal:\n");

let num = 8;
let max;
if(num%2 === 0){
    max = num/2;
}else{
    max = (num+1)/2;
}

let linea = "";
for (let i=max; i>=0; i--){
    for (let j=i-1; j<max; j++){ // con j=i-1 Se elimina la última linea
        linea+='* ';
    }
    console.log(linea);
    linea="";
}

let linea2 = "";
for (let i=0; i<max; i++){
    for (let j=i; j<max; j++){
        linea2+='* ';
    }
    console.log(linea2);
    linea2="";
}



