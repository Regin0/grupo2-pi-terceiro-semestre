
import React from 'react';

import { Modal, Button, Icon, Form, Input, Checkbox } from 'antd';

function LoginForm(){
    return (
        <Form>
            <Form.Item label="E-mail">
                <Input />
            </Form.Item>
            <Form.Item label="Senha" hasFeedback>
                <Input.Password />
            </Form.Item>
            <Form.Item>
                <Checkbox>Mantenha-me logado</Checkbox>,
            </Form.Item>
            <Button type="primary" className="full-width">Login</Button>
        </Form>
    )
}


function UserModal({open, setOpen}){

    function closeModal(){ setOpen(false); }

    return (
        <Modal
            visible={open}
            title="Carrinho de compras"
            onOk={closeModal}
            onCancel={closeModal}
        >
            <LoginForm/>
        </Modal>
    )
}

export default function UserMenu(){
    const [open, setOpen] = React.useState(false);

    function openMenu(){ setOpen(true); }
    return (<>
        <Button
            onClick={openMenu}
            ghost
            type="default"
            shape="circle"
        >
            <Icon type="user"/>
        </Button>
        <UserModal open={open} setOpen={setOpen}/>
    </>)
}

