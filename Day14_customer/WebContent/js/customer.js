


function makeYear(){
	var year = document.getElementById("year");
	
	for(var i=1900; i< new Date().getFullYear(); i++){
		var option = document.createElement("option");
		option.value = i;
		option.innerText = i;
		year.appendChild(option);
	}
	
}