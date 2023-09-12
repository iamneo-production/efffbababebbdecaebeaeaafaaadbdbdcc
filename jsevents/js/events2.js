let fir = window.confirm("are you a prgrammer")
    if(fir == true)
    {
        window.alert("hello")
           document.getElementById("ans").innerHTML = "answer the below the question";
           document.getElementById("ques").innerHTML ="System.out.println(123456789);";

        }
        else
        {
            document.getElementById("val").style.visibility = "hidden";
            document.getElementById("button1").style.visibility = "hidden";
            document.getElementById("ans").innerHTML = "Thank You";
        }
        function check()
        {
            
            var x = document.getElementById("val").value;
            if(x == "yes")
                window.alert("you are right")
            else
                window.alert("no you are wrong")
        }