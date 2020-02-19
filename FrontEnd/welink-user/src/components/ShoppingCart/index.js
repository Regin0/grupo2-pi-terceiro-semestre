import React from 'react';

import { Button, Icon, Modal, Table } from 'antd';

//import './style.css';

const dataSource = [
  {
    key: '1',
    name: 'Mike',
    age: 32,
    address: '10 Downing Street',
  },
  {
    key: '2',
    name: 'John',
    age: 42,
    address: '10 Downing Street',
  },
];

const columns = [
  {
    title: 'Name',
    dataIndex: 'name',
    key: 'name',
  },
  {
    title: 'Age',
    dataIndex: 'age',
    key: 'age',
  },
  {
    title: 'Address',
    dataIndex: 'address',
    key: 'address',
  },
];

function CartModal({open, setOpen}){
    function closeCart(){ setOpen(false); }

    return (
        <Modal
            visible={open}
            title="Carrinho de compras"
            onOk={closeCart}
            onCancel={closeCart}
        >
            <Table dataSource={dataSource} columns={columns} />
        </Modal>
    )
}

export default function ShoppingCart(){
    const [open, setOpen] = React.useState(false);

    function openCart(){ setOpen(true); }

    return (<>
        <Button ghost onClick={openCart} type="default" shape="circle">
            <Icon type="shopping-cart"/>
        </Button>
        <CartModal open={open} setOpen={setOpen}/>
    </>)
}

