// Code Signal

function solution(year) {

    var century;

    if (year > 999 ) {
    parte1 = year.toString().substring(0,2);
    parte2 = year.toString().substring(2,4);
    
        if (parte2 == "00") {
            century = parseInt(parte1);
        } else {
            century = parseInt(parte1);
            century = century + 1; 
        }
    
    } else if (year >= 100 && year <= 999) {

        parte1 = year.toString().substring(0,1);
        parte2 = year.toString().substring(1,3);
    
        if (parte2 == "00") {
            century = parseInt(parte1);
        } else {
            century = parseInt(parte1);
            century = century + 1; 
        }
        
        
    } else {
        century = 1;
    }
    return century;
}

