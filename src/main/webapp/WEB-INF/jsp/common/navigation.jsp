<nav role="navigation" class="navbar navbar-default">
    <div class="">
        <a href="/" class="navbar-brand">Assignment</a>
    </div>
    <div class="navbar-collapse">
        <ul class="nav navbar-nav">
            <li class="home"><a href="/">Home</a></li>
            <li class="employees"><a href="/list-employees">Employees</a></li>
            <li class="settings"><a href="/settings">Settings</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/logout">Logout</a></li>
        </ul>
    </div>
</nav>

<script>
    var pathName = $(location).attr("pathname");
    console.log("pathname:", pathName);
    if (pathName === "/list-employees" || pathName === "/add-employee") {
        $(".employees").addClass("active");
    }
    else if (pathName === "/settings" || pathName === "/transfer") {
        $(".settings").addClass("active");
    }
    else {
        $(".home").addClass("active");
    }

</script>