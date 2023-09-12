
document.getElementById("load").addEventListener("onload",loading())
document.getElementById("load").addEventListener("onmouseover",hover())
document.getElementById("work").addEventListener("onclick",show())
let a=0;
function loading()
{
    a = window.prompt("Enter a number")
}
function hover()
{
    document.getElementById("image").src = "https://www.icegif.com/wp-content/uploads/tom-and-jerry-icegif-17.gif";
}
function out()
{
    document.getElementById("image").src = "https://upload.wikimedia.org/wikipedia/en/2/2f/Jerry_Mouse.png";
}
function show()
{
    document.write("clicked successfully");
}
</script>