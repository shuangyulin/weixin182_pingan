const menu = {
    list() {
        return [
    {
        "backMenu":[
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    },
    {
        "backMenu":[
			{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"出入规定",
                        "menuJump":"列表",
                        "tableName":"churuguiding"
                    }
                ],
                "menu":"出入规定"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除"
                        ],
                        "menu":"出入申请",
                        "menuJump":"列表",
                        "tableName":"churushenqing"
                    }
                ],
                "menu":"出入申请"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"健康信息",
                        "menuJump":"列表",
                        "tableName":"jiankangxinxi"
                    }
                ],
                "menu":"健康信息"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"疫情讯息",
                        "menuJump":"列表",
                        "tableName":"news"
                    }
                ],
                "menu":"疫情讯息"
            }
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"是",
        "hasFrontRegister":"是",
        "roleName":"用户",
        "tableName":"yonghu"
    }
]

	}
}
export default menu;
