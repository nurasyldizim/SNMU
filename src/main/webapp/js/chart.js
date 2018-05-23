/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
google.load("visualization", "1", {packages:["corechart"]});
google.setOnLoadCallback(drawCharts);
function drawCharts() {
    var selectChart = document.getElementById("chartSelect");
    var columnNumber = selectChart.options[selectChart.selectedIndex].value;
    document.getElementById("optionName").innerHTML = selectChart.options[selectChart.selectedIndex].text;
    var table = document.getElementById("table"),rows = parseInt(table.rows.length);
    var pnzArray = [];
        for(var r = 2; r<rows-8; r++){
            pnzArray.push(table.rows[r].cells[0].innerHTML)
        }
    
    var uniquePnzs = [];
    $.each(pnzArray, function(i, el){
    if($.inArray(el, uniquePnzs) === -1) uniquePnzs.push(el);
    });
    uniquePnzs.pop();
    uniquePnzs.unshift("temp");
    var i;
 
    barDataTemp = [
    ['Day'],
    ['1:00'],
    ['7:00'],
    ['13:00'],
    ['19:00']
  ];
  for (i=0; i<uniquePnzs.length; i++) {
        barDataTemp[0][i] = uniquePnzs[i];
    }
  for (i=1; i<uniquePnzs.length; i++) {
        barDataTemp[1][i] = 0;
    }
  for (i=1; i<uniquePnzs.length; i++) {
        barDataTemp[2][i] = 0;
    }
  for (i=1; i<uniquePnzs.length; i++) {
        barDataTemp[3][i] = 0;
    }
  for (i=1; i<uniquePnzs.length; i++) {
        barDataTemp[4][i] = 0;
    }
    
            for(var r = 2; r<rows-8; r++){
                for(i=1;i<uniquePnzs.length;i++){
                    switch(table.rows[r].cells[0].innerHTML+table.rows[r].cells[1].innerHTML){
                        case uniquePnzs[i]+"1:00":
                            barDataTemp[1][i] = parseFloat(table.rows[r].cells[columnNumber].innerHTML);
                            break;
                        case uniquePnzs[i]+"7:00":
                            barDataTemp[2][i] = parseFloat(table.rows[r].cells[columnNumber].innerHTML);
                            break;
                        case uniquePnzs[i]+"13:00":
                            barDataTemp[3][i] = parseFloat(table.rows[r].cells[columnNumber].innerHTML);
                            break;
                        case uniquePnzs[i]+"19:00":
                            barDataTemp[4][i] = parseFloat(table.rows[r].cells[columnNumber].innerHTML);
                            break;
                    }
                }
        }
         var barData = google.visualization.arrayToDataTable(barDataTemp);
  var barOptions = {
    focusTarget: 'category',
    backgroundColor: 'transparent',
    colors: ['Red','Green','Yellow','Blue','Orange','Purple','Cyan','Magenta','Lime','Pink','Teal','Lavender','Brown','Beige','Maroon','Olive','Coral','Navy','Grey','White','Black'],
    fontName: 'Open Sans',
    chartArea: {
      left: 50,
      top: 10,
      width: '100%',
      height: '70%'
    },
    bar: {
      groupWidth: '80%'
    },
    hAxis: {
        title: 'час',
      textStyle: {
        fontSize: 11
      }
    },
    vAxis: {
      title: 'мг/м3',
      minValue: 0,
      maxValue: 1,
      baselineColor: '#DDD',
      gridlines: {
        color: '#DDD',
        count: 10
      },
      textStyle: {
        fontSize: 11
      }
    },
    legend: {
      position: 'bottom',
      textStyle: {
        fontSize: 12
      }
    },
    animation: {
      duration: 1200,
      easing: 'out',
			startup: true
    }
  };
  // draw bar chart twice so it animates
  var barChart = new google.visualization.ColumnChart(document.getElementById('bar-chart'));
  var clickbutton = document.getElementById('clickbutton');
  barChart.draw(barData, barOptions);
  clickbutton.addEventListener('click', function() {
           document.getElementById('bar-chart').innerHTML = '<img src="' + barChart.getImageURI() + '">';
        });
}
