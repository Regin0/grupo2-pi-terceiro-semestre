import React from 'react';

import { Carousel } from 'antd';
import './style.css';

function CarouselImage({src}){
    return <figure
        style={{
            backgroundImage: `url('${src}')`
        }}/>
}

export default function SalesCarousel(){
    return (
        <Carousel autoplay className="sales-carousel">
            <CarouselImage src="https://cdn.pixabay.com/photo/2018/06/10/17/39/market-3466906_960_720.jpg"/>
            <CarouselImage src="https://cdn.pixabay.com/photo/2015/09/21/14/24/supermarket-949913_960_720.jpg"/>
        </Carousel>
    )
}
