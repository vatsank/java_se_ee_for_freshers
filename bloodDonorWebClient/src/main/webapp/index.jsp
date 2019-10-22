<html>

<script
  src="https://code.jquery.com/jquery-2.2.4.min.js"
  integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
  crossorigin="anonymous"></script>
  
  
  <script type="text/javascript">
  
  $(function(){
	  
	  var config ={
			  
			  type:"GET",
			  url:"http://localhost:2020/bloodDonors/webapi/donors/",
			  success:function(data){console.log(data)}
	  };
	  
	  $.ajax(config);
  });
  
 
   </script>
<body>
    <h2>Jersey RESTful Web Client</h2>
    <h4>Design By Your Name</h4>
 
  
</body>
</html>
