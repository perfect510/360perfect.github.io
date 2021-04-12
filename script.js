
const list = document.querySelector('.list');
const products = {
    1: {
        "name": 'Rainbow Seat',
        "price": '14999'
    },
    2: {
        "name": 'Monochrome Theme',
        "price": '17999'
    },
    3: {
        "name": 'Devil Theme',
        "price": '5000'
    },
    4: {
        "name": 'Floral',
        "price": '9000'
    },
    5: {
        "name": 'Black Sunroof',
        "price": '19999'
    },
    6: {
        "name": 'Glass Sunroof',
        "price": '19999'
    },
    7: {
        "name": 'Burnt Orange',
        "price": '18000'
    },
    8: {
        "name": 'Gaming Theme',
        "price": '19999'
    },
    9: {
        "name": 'Starlight Gazing',
        "price": '20999'
    },
    10: {
        "name": 'Colour Changing with Remote',
        "price": '10000'
    },
    11: {
        "name": 'Reverse Camera',
        "price": '6000'
    },
    12: {
        "name": 'Android Car Studio',
        "price": '13500'
    }
}
let item = [];
let bill = [];

function addToCart(x) {
    const span = `<span class="price">₹${products[x].price}</span>`
    const result = products[x].name + " " + span;
    if (item.includes(products[x]) === false) item.push(result);
    bill.push(products[x].price);

}

function cart() {
    list.innerHTML = "";
    for (let i = 0; i < item.length; i++) {
        let text = item[i];
        let listItem = document.createElement("LI");
        listItem.innerHTML = text;
        list.appendChild(listItem);
        listItem.style.textAlign = 'left';
    }
    const btn = document.querySelector('.bill');
    const total = bill.reduce(add);

    function add(accumulator, a) {
        return parseInt(accumulator) + parseInt(a);
    }
    console.log(total);
    btn.innerHTML = `Total Bill is ₹${total}`;
    }

  $("#booking-form").submit((e)=>{
            e.preventDefault()
            $.ajax({
                url:"https://script.google.com/macros/s/AKfycbzWDduUSF95E6Sg839Bic9y0RmjpTInfc0kmkaM/exec",
                data:$("#booking-form").serialize(),
                method:"post",
                success:function (response){
                    alert("Form submitted successfully. The shop will contact you within 48hrs")
                    window.location.reload()
                  
                },
                error:function (err){
                    alert("Something Error")
    
                }
            })
        })
        
  