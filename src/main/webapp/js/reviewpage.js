window.addEventListener("DOMContentLoaded", function() {
    const productId = getParameterByName("id");
    const allCommentRequestNumber = 0;

    comment.requestComment(productId, allCommentRequestNumber);
    comment.requestCommentInfo(productId);

    drawProductTitle(productId);
})

function drawProductTitle(productId) {
    let httpRequest = new XMLHttpRequest();

    httpRequest.addEventListener("load", function() {
        let productInfo = JSON.parse(httpRequest.responseText);
        let titleAnchor = document.querySelector(".top_title .title");

        let titleText = "";
        titleText += productInfo.description;

        titleAnchor.innerText = titleText;
    })

    httpRequest.open("GET", "./api/products/" + productId, true);
    httpRequest.send();
}