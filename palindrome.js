
 const checkPal = function(s) {
    let end = s.length - 1; 
    for(let i = 0; i < s.length; i++) {
        if(i >= end) {
            return true; 
        }
        if(s.charAt(i)!==s.charAt(end--)) {
            return false; 
        }
    }
    return true;       
}

const longestPalindrome = function(s) {
    let longest = s.charAt(0); 
    for (let i = 0; i < s.length; i ++) {
        let record = ""; 
        for (let j = i; j < s.length; j++) {
            record = record.concat(s.charAt(j)); 
            if (s.charAt(i) === s.charAt(j)) {
                if(record.length > longest.length && checkPal(record)) {
                    longest = record; 
                }
            }
        }
    }
    return longest; 
};
