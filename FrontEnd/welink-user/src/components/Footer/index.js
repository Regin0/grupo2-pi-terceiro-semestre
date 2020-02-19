import React from 'react';

import './style.css'

import { Typography } from 'antd';
const { Text } = Typography;

export default function Footer(){
    return (
        <footer className="footer">
            <div className="market">
                <Text>Mercadinho do Antônio - +55 11 12345-6789 ✆ </Text>
            </div>
            <div className="brand">
                <Text>WeLink ® - 2020</Text>
            </div>
        </footer>
    )
}
