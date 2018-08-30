var config = {
        container: "#tree",
        animateOnInit: true,
        rootOrientation: "WEST",
		
        node: {
            collapsable: true
        },
        animation: {
            nodeAnimation: "easeOutBounce",
            nodeSpeed: 700
        }
    },
	
    malory = {
        image: "lion.png",
		text: { name: "Lion" }
    },
	
    lana = {
		parent: malory,
        image: "zebra.png",
		text: { name: "Zebra" }
    },
	
    sterling = {
        parent: malory,
        childrenDropLevel: 1,
        image: "buffalo.png",
		text: { name: "buffalo" }
    },

    pseudo = {
        parent: malory,
        pseudo: true
    },

    cheryl = {
        parent: pseudo,
        image: "antelope.png",
		text: { name: "Antelope" }
    },

    //pam = {
	//	parent: sterling,
    //    image: "img/pam.png"
    //},

    chart_config = [config, malory, lana, sterling, pseudo, cheryl];