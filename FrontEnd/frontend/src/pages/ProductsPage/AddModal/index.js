import React from 'react';
import { Modal, Form, Button, Input, InputNumber, DatePicker } from 'antd';
import fmts from 'utils/formatters';

function ModalContent({open, setOpen}){

    const onOk = e => setOpen(false);
    const onCancel = e => setOpen(false);

    console.log('fmts', fmts)

    const itemLayout = {
      labelCol: {
        xs: { span: 24 },
        sm: { span: 8 },
      },
      wrapperCol: {
        xs: { span: 24 },
        sm: { span: 16 },
      },
    }

    return (
        <Modal title="Adicionar produto" visible={open} onOk={onOk} onCancel={onCancel}>
            <Form layout="vertical" {...itemLayout}>
                <Form.Item label="Nome">
                    <Input/>
                </Form.Item>
                <Form.Item label="Marca">
                    <Input/>
                </Form.Item>
                <Form.Item label="Preço">
                    <InputNumber className="full-width" parser={fmts.currency.parser}formatter={fmts.currency.formatter}/>
                </Form.Item>
                <Form.Item label="Data de vencimento">
                    <DatePicker className="full-width" format={fmts.date.default}/>
                </Form.Item>
            </Form>
        </Modal>
    )
}

export default function AddModal(){
    const [open, setOpen] = React.useState(true);

    const handleAdd = e => setOpen(true);

    return (
        <React.Fragment>
            <Button type="primary" icon="plus" onClick={handleAdd}>Adicionar</Button>
            <ModalContent open={open} setOpen={setOpen}/>
        </React.Fragment>
    )
}
