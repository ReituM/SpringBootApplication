<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Metric Conversion</title>
<style>
 #form{
       width:50%;
       margin-left:auto;
       margin-right:auto;
       }
        legend{
       text-align:center;
       font-size:30px;
       }
        p{
         text-align:center;
         }
         #yeah{
margin-bottom:10px;
}

</style>
</head>
<body>


		  <form id="form" action="/index.html" method="post">
			  <fieldset>
			 <legend>Metric Conversion</legend>
             <p>Please select the option below:</p>
             <form id="yeah">
             <table border="0">
               <tr>
			    <td><label for="centimeter">Centimeter To Meter</label></td>
			   <td><input type="number" value="${message.output}" name="centimeterValue"></td>
			   </tr>
			    
			   <tr>
			    <td><label for="meter">Meter To Kilometer</label></td>
			    <td><input type="number" value="${message.one}" name="one"></td>
			    </tr>
			  
			    <tr>
			    <td><label for="mile">Mile To Inch</label></td>
			     <td><input type="number" value="${message.two}" name="two"></td>
			     </tr>
			   
			  
			
			  
			  
		
			    <input type="submit" class="bottom" name="usersubmit" value="CONVERT">
			
		  </fieldset>
		</form>



</body>
</html>