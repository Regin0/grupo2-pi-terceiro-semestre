import React from 'react';
import { Link } from 'react-router-dom';

import { Layout, Row, Col } from 'antd';
import { Form, Checkbox, Input, Button, DatePicker } from 'antd';
import { Card, Typography } from 'antd';
const { Paragraph } = Typography;

import { CenteredLayout } from 'layouts/';
import fmts from 'utils/formatters';

function SigninForm(){
    return (
        <Form>
            <Form.Item label="Nome">
                <Input />
            </Form.Item>
            <Row type="flex" justify="space-between" gutter={24}>
                <Col span={12}>
                    <Form.Item label="CPF">
                        <Input />
                    </Form.Item>
                </Col>
                <Col span={12}>
                    <Form.Item label="Data de nascimento">
                        <DatePicker format={fmts.date.default}/>
                    </Form.Item>
                </Col>
            </Row>
            <Form.Item label="E-mail">
                <Input />
            </Form.Item>
            <Form.Item label="Senha" hasFeedback>
                <Input.Password />
            </Form.Item>
            <Form.Item>
                <Checkbox>
                    Eu concordo em receber mensagens com novidades em meu e-mail.
                </Checkbox>,
            </Form.Item>
            <Button type='primary' className="full-width">Cadastrar</Button>
        </Form>
    )
}

export default function SigninPage() {
    return (
        <CenteredLayout fullHeight>
            <Col xs={24} lg={10}>
                <Card>
                        <SigninForm/>
                        <Paragraph className="mv1">Já tem conta? <Link to="/login">Clique aqui para entrar</Link></Paragraph>
                </Card>
            </Col>
        </CenteredLayout>
    );
}
