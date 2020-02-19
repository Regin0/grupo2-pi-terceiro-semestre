import React from 'react';

import { Drawer, Button, Icon } from 'antd';

function MenuDrawer({open, setOpen}){

    function closeDrawer(){ setOpen(false); }

    return (
        <Drawer
            title="WeLink"
            placement="left"
            visible={open}
            onClose={closeDrawer}
        />
    )
}

export default function MenuToggler(){
    const [open, setOpen] = React.useState(false);

    function openDrawer(){ setOpen(true); }
    return (<>
        <Button
            onClick={openDrawer}
            ghost
            type="default"
        >
            <Icon type="menu"/>
        </Button>
        <MenuDrawer open={open} setOpen={setOpen}/>
    </>)
}

