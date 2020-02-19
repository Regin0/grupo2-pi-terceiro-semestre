import React from 'react';

import './style.css'

import { Typography } from 'antd';
const { Text } = Typography;

export default function Welcome(){
    return (
        <div className="welcome">
            <Text>Bem Vindo!</Text>
        </div>
    )
}
