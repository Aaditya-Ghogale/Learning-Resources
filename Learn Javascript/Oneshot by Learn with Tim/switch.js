const prompt=require("prompt-sync")()

let day=prompt("enter a day and i will tell you the menu :").trim()

switch(day.toLowerCase()){
    case "monday":
        console.log("Today is Monday and the menu is Pasta")
        break;
    case "tuesday":
        console.log("Today is Tuesday and the menu is Tacos")
        break;
    case "wednesday":
        console.log("Today is Wednesday and the menu is Burgers")
        break;
    case "thursday":
        console.log("Today is Thursday and the menu is Sandwiches")
        break;  
    case "friday":
        console.log("Today is Friday and the menu is Pizza")
        break;
    case "saturday":
        console.log("Today is Saturday and the menu is BBQ")
        break;
    case "sunday":
        console.log("Today is Sunday and the menu is Roasted Chicken")
        break;
    default:
        console.log("Invalid day entered")
}