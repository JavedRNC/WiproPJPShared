var today = new Date();
var date = today.getDate()+'-'+today.getMonth()+'-'+today.getYear();
var time = today.getHours()+':'+today.getMinutes()+':'+today.getSeconds();
var dateAndTime = date + ' ' + time;
print(dateAndTime);