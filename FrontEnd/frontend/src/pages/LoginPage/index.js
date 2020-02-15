import React from 'react';

import { Layout, Row, Col } from 'antd';
import { Form, Checkbox, Input, Button } from 'antd';
import { Card } from 'antd';

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
                <Checkbox>
                    Eu concordo em receber mensagens com novidades em meu e-mail.
                </Checkbox>,
            </Form.Item>
            <Button type='primary'>Login</Button>
        </Form>
    )
}

export default function LoginPage() {
    return (
        <CenteredLayout fullHeight>
            <Col span={9}>
                <Card>
                        <LoginForm/>
                </Card>
            </Col>
        </CenteredLayout>
    );
}
