<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/add-employee">Add Employee</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>List of Employee's</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th width="15%">Name</th>
                    <th width="15%">Mobile</th>
                    <th width="20%">Address</th>
                    <th width="10%">Grade</th>
                    <th width="20%">Account Number</th>
                    <th width="20%">Current Balance</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td>${employee.name}</td>
                        <td>${employee.mobile}</td>
                        <td>${employee.address}</td>
                        <td>${employee.gradeInfo.name}</td>
                        <td>${employee.bankInfo.accountNumber}</td>
                        <td>${employee.bankInfo.currentBalance}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<%@ include file="common/footer.jsp"%>