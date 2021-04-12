
const list = document.querySelector('.list');
const products = {
    1: {
        "name": 'Steering Wheel Cover Brown & Black',
        "price": '3000'
    },
    2: {
        "name": 'Steering Wheel Cover White',
        "price": '3000'
    },
    3: {
        "name": 'Steering Wheel Cover Black',
        "price": '3500'
    },
    4: {
        "name": 'Window Chrome Beading',
        "price": '1200'
    },
    5: {
        "name": 'Fibre Cloth',
        "price": '100'
    },
    6: {
        "name": 'Blind Spot Mirror',
        "price": '750'
    },
    7: {
        "name": 'Coido Tyre Inflator',
        "price": '3000'
    },
    8: {
        "name": 'Extra Storage',
        "price": '2000'
    },
    9: {
        "name": 'Car Mattress',
        "price": '2000'
    },
    10: {
        "name": 'Aqua Sticker',
        "price": '1000'
    },
    11: {
        "name": 'Wing Sticker',
        "price": '750'
    },
    12: {
        "name": 'Sticker',
        "price": '750'
    },
    13: {
        "name": 'Krishna Sticker',
        "price": '750'
    },
    14: {
        "name": 'Hiding Sticker',
        "price": '500'
    },
    15: {
        "name": 'Car Charger',
        "price": '1250'
    },
    16: {
        "name": 'Bumper Protector',
        "price": '2000'
    },
    17: {
        "name": 'Godrej Air Freshner',
        "price": '360'
    },
    18: {
        "name": 'Footstep Garnish',
        "price": '1999'
    },
    19: {
        "name": 'Gear Cover',
        "price": '500'
    },
    20: {
        "name": 'Skull Gear Cover',
        "price": '750'
    },
    21: {
        "name": 'Gear Cover Red & Black',
        "price": '500'
    },
    22: {
        "name": 'Floral Gear Cover',
        "price": '500'
    },
    23: {
        "name": 'Smiley Spring Doll',
        "price": '250'
    },
    24: {
        "name": 'Pitbull Statue',
        "price": '699'
    },
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

