<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Company Settings</div>
                <div class="panel-body">
                    <form:form method="post" modelAttribute="setting">
                        <form:hidden path="id" />
                        <fieldset class="form-group">
                            <form:label path="companyBankBalance">Company Bank Balance</form:label>
                            <form:input path="companyBankBalance" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="companyBankBalance" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="lowGradeSalary">Lowest Grade Basic Salary</form:label>
                            <form:input path="lowGradeSalary" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="lowGradeSalary" cssClass="text-warning" />
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                        <a href="/transfer"><button type="button" class="btn btn-success">Transfer</button></a>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="common/footer.jsp"%>