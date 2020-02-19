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
            <CarouselImage src="https://www.solidbackgrounds.com/images/950x350/950x350-teal-solid-color-background.jpg"/>
            <CarouselImage src="https://www.solidbackgrounds.com/images/950x350/950x350-crimson-solid-color-background.jpg"/>
            <CarouselImage src="https://www.solidbackgrounds.com/images/3508x2480/3508x2480-dark-pastel-blue-solid-color-background.jpg"/>
        </Carousel>
    )
}
