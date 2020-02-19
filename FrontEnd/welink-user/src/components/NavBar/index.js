import React from 'react';

import { Row, Col } from 'antd';
import { Input, Affix } from 'antd';
import { Drawer, Button, Icon } from 'antd';

import './style.css';

function SearchBar(){
    return (
        <Input.Search placeholder="Procure aqui" className="w-100"/>
    )
}

function ShoppingCart(){
    return (<Button type="primary" shape="circle">
        <Icon type="shopping-cart"/>
    </Button>)
}

function UserMenu(){
    return (<Button type="primary" shape="circle">
        <Icon type="user"/>
    </Button>)
}

function MenuToggler(){
    return (<Button type="primary" shape="circle">
        <Icon type="menu" className="m-0"/>
    </Button>)
}

export default function NavBar(){
    return (
        <Affix>
            <Row type="flex" justify="space-between" align="middle"
                className="navbar p-3">
                <Col><MenuToggler/></Col>
                <Col xs={15} lg={21}><SearchBar/></Col>
                <Col><ShoppingCart/></Col>
                <Col><UserMenu/></Col>
            </Row>
        </Affix>
    )
}
