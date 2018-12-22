$(function(){
	$.extend($.fn.validatebox.defaults.rules, {    
		range: {    
        validator: function(value, param){    
            return value.length >= param[0] && value.length <= param[1];    
        },    
        message: 'Please enter at least {0} characters and the most {1} characters.'   
    }    
	}); 
})