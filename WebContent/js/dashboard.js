$(document).ready(function(){
  loadQuotations();
});

function loadQuotations()
{
  var stockQuotation;
  $.post("/StockAnlys/stock/data",{},
  function(data, status){
    if (status)
      {
        stockQuotation = data.json;
        for (var i = 0; i < stockQuotation.length; i++)
        {
          var txt = "<tr>" + 
          "<td>" + stockQuotation[i].code + "</td>" +
          "<td>" + stockQuotation[i].name + "</td>" +
          "<td>" + stockQuotation[i].changepercent + "</td>" +
          "<td>" + stockQuotation[i].trade + "</td>" +
          "<td>" + stockQuotation[i].open + "</td>" +
          "<td>" + stockQuotation[i].high + "</td>" +
          "<td>" + stockQuotation[i].low + "</td>" +
          "<td>" + stockQuotation[i].settlement + "</td>" +
          "<td>" + stockQuotation[i].volume + "</td>" +
          "<td>" + stockQuotation[i].turnoverratio + "</td>" +
          "<td>" + stockQuotation[i].amount + "</td>" +
          "<td>" + stockQuotation[i].per + "</td>" +
          "<td>" + stockQuotation[i].pb + "</td>" +
          "<td>" + stockQuotation[i].mktcap + "</td>" +
          "<td>" + stockQuotation[i].nmc + "</td>" +
          "</tr>";
          $("#quotations").append(txt);
        }
      }
  });
}