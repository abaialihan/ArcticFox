<#include "security.ftl">
<#import "pager.ftl" as p>


<div class="card-columns" id="message-list">
    <#list page.content as message>
        <div class="card my-3 bg-secondary text-white" data-id="${message.id}">
            <#if message.filename??>
                <img src="/img/${message.filename}" class="card-img-top"/>
            </#if>
            <div class="m-2">
                <span>${message.text}</span><br/>
                <i>#${message.tag}</i>
            </div>
            <div class="card-footer text-muted container">
                <div class="row">
                    <a class="col align-self-center text-info" href="/user-messages/${message.author.id}"> ${message.authorName}</a>
                    <a class="col align-self-center" href="/messages/${message.id}/like">
                        <#if message.liked>
                            <i class="fas fa-heart"></i>
                        <#else>
                            <i class="far fa-heart"></i>
                         </#if>
                        ${message.likes}
                    </a>
                    <#if message.author.id == currentUserId>
                        <a class="col btn btn-info" href="/user-messages/${message.author.id}?message=${message.id}">Edit</a>
                    </#if>
                </div>
            </div>
        </div>
            <#else>
                <h3 class="h3">No message</h3>
    </#list>
</div>

<@p.pager url page />