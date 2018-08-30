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
        image: "img/malory.png",
		text: { 
			name: "Simple ", 
			title: "One of kind",
        }
    },
    lana = {
        parent: malory,
        image: "img/lana.png"
    }
    figgs = {
        parent: lana,
        image: "img/figgs.png"
    }
    sterling = {
        parent: malory,
        childrenDropLevel: 1,
        image: "img/sterling.png"
    },

    woodhouse = {
        parent: sterling,
        image: "img/woodhouse.png"
    },

    pseudo = {
        parent: malory,
        pseudo: true
    },

    cheryl = {
        parent: pseudo,
        image: "img/cheryl.png"
    },

    pam = {
        parent: pseudo,
        image: "img/pam.png"
    },

    chart_config = [config, malory, lana, figgs, sterling, woodhouse, pseudo, pam, cheryl];