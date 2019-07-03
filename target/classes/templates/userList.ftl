<#import "parts/common.ftl" as c>

<@c.page>
List of users

<table class="table">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Role</th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
        <tr>
            <td>${user.username}</td>
            <td><#list user.roles as role>${role}<#sep>, </#list></td>
            <td><a class="btn btn-warning" href="/user/${user.id}">edit</a></td>
        </tr>
    </#list>
    </tbody>
</table>
</@c.page>
