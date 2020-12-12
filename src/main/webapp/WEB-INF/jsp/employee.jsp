<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Add Employee</div>
                <div class="panel-body" style="max-height: 600px; overflow-y: scroll;">
                    <form:form method="post" modelAttribute="employee">
                        <form:hidden path="id" />
                        <fieldset class="form-group">
                            <form:label path="name">Name</form:label>
                            <form:input path="name" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="name" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="mobile">Mobile</form:label>
                            <form:input path="mobile" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="mobile" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="address">Address</form:label>
                            <form:textarea path="address" type="text" class="form-control"
                                           rows="4" required="required" />
                            <form:errors path="address" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="gradeInfo.id">Grade</form:label>
                            <form:select path="gradeInfo.id" required="required" class="form-control">
                                <c:forEach items="${grades}" var="grade">
                                    <form:option value="${grade.id}">${grade.name}</form:option>
                                </c:forEach>
                            </form:select>
                            <form:errors path="gradeInfo.id" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="bankInfo.accountName">Account Name</form:label>
                            <form:input path="bankInfo.accountName" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="bankInfo.accountName" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="bankInfo.accountNumber">Account Number</form:label>
                            <form:input path="bankInfo.accountNumber" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="bankInfo.accountNumber" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="bankInfo.accountType">Account Type</form:label>
                            <form:select path="bankInfo.accountType" required="required" class="form-control">
                                <form:option value="Savings">Savings</form:option>
                                <form:option value="Current">Current</form:option>
                            </form:select>
                            <form:errors path="bankInfo.accountType" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="bankInfo.bankName">Bank Name</form:label>
                            <form:input path="bankInfo.bankName" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="bankInfo.bankName" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="bankInfo.branchName">Branch Name</form:label>
                            <form:input path="bankInfo.branchName" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="bankInfo.branchName" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="bankInfo.currentBalance">Balance</form:label>
                            <form:input path="bankInfo.currentBalance" type="number" class="form-control"
                                        required="required" />
                            <form:errors path="bankInfo.currentBalance" cssClass="text-warning" />
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="common/footer.jsp"%>