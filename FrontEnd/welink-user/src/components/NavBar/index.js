import React from 'react';
import { Layout, Menu } from 'antd';
import { Row, Col } from 'antd';
import { Input, Typography } from 'antd';
import { Drawer, Button, Icon } from 'antd';

import './style.css';

const { Text } = Typography;

function SearchBar(){
    return (
        <Input.Search placeholder="Procure aqui" className="w-100"/>
    )
}

function ShoppingCart(){
    return (<Button shape="circle">
        <Icon type="shopping-cart"/>
    </Button>)
}

function UserMenu(){
    return (<Button shape="circle">
        <Icon type="user"/>
    </Button>)
}

function MenuToggler(){
    return (<Button shape="circle">
        <Icon type="menu" className="m-0"/>
    </Button>)
}

export default function NavBar(){
    return (
        <Row type="flex" justify="space-between" align="middle"
            className="navbar p-3">
            <Col><MenuToggler/></Col>
            <Col lg={21}><SearchBar/></Col>
            <Col><ShoppingCart/></Col>
            <Col><UserMenu/></Col>
        </Row>
    )
}
