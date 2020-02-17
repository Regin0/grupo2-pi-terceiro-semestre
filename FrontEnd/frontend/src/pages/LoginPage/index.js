import React from 'react';
import { Link } from 'react-router-dom';

import { Layout, Row, Col } from 'antd';
import { Form, Checkbox, Input, Button } from 'antd';
import { Card, Typography } from 'antd';
const { Paragraph } = Typography;

import { CenteredLayout } from 'layouts/';

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

export default function LoginPage() {
    return (
        <CenteredLayout fullHeight>
            <Col xs={24} lg={10}>
                <Card>
                        <LoginForm/>
                        <Paragraph className="mv1">Ainda não tem conta? <Link to="/signin">Clique aqui para se cadastrar</Link></Paragraph>
                </Card>
            </Col>
        </CenteredLayout>
    );
}
