// /**
//  * Created by nhatnk on 4/26/17.
//  */

function Hero(image, top, left, size,v){
    this.vantoc=v
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;

    this.getHeroElement = function(){
        return '<img width="'+ this.size + '"' +
            ' height="'+ this.size + '"' +
            ' src="' + this.image +'"' +
            ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;" />';
    }

    this.moveRight = function(){
        this.left += this.vantoc;
        console.log('ok1: ' + this.left);
    }
    this.moveLeft=function () {
    this.right+=this.vantoc
        console.log('ok2: ' + this.right);
    }
    this.moveDown=function () {
        this.top+=this.vantoc
        console.log('ok3: ' + this.top);
    }

}

var hero = new Hero('pikachu.png', 20, 30, 200,20);

function start(){
    if(hero.left < window.innerWidth - hero.size){
        hero.moveRight();
    }

    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start, 500)
}
function start1(){
        if(hero.top < window.innerWidth - hero.size){
        hero.moveDown();
    }
    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start1, 500)
}
function start2(){
        if(hero.right < window.innerWidth - hero.size){
        hero.moveLeft()
    }
    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start2, 500)
}

 start();
start1();
start2();