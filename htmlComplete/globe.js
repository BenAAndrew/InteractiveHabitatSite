 var data = [[[23.6850,-90.3563],[20.5937,-78.9629],[44.7470, -134.7812]] , [[38.9072,77.0369],[34.0522,118.2437],[19.4326,99.1332]] , [[-33.8688,-151.2093]]];
 var ignore = [];
 var href = window.location.href.split("/");
 if(href[href.length-1].toLowerCase() == "interactive.html"){
	for (var i = 0; i < data.length; i++) {
		ignore.push(i);
	}
}
 var colours = ['red', 'yellow', 'white', 'orange', 'green', 'cyan', 'pink'];
	function createGlobe(){
		var planet = planetaryjs.planet();
	 
		//GLOBE
		planet.loadPlugin(planetaryjs.plugins.earth({
			topojson: { file:   'world-110m-withlakes.json' },
			oceans:   { fill:   '#000080' },
			land:     { fill:   '#339966' },
			borders:  { stroke: '#008000' }
		}));
		planetaryjs.plugins.oceans({
			fill: '#000080'
		});
		planetaryjs.plugins.land({
			fill: '#339966', stroke: '#000000'
		});
		planetaryjs.plugins.borders({
			stroke: '#008000', lineWidth: 0.25, type: 'both'
		});
		
		//ZOOM/DRAG
		planet.loadPlugin(planetaryjs.plugins.pings());
		// The `zoom` and `drag` plugins enable  manipulating the globe with the mouse.
		planet.loadPlugin(planetaryjs.plugins.zoom({
			scaleExtent: [100, 300]
		}));
		planet.loadPlugin(planetaryjs.plugins.drag({
		// Dragging the globe should pause the
		// automatic rotation until we release the mouse.
			onDragStart: function() {
			  this.plugins.autorotate.pause();
			},
			onDragEnd: function() {
			  this.plugins.autorotate.resume();
			}
		}));
		
		//PINGS
		setInterval(function() {
			/*//var lat = Math.random() * 170 - 85;
			var lat = 51.5074;
			//var lng = Math.random() * 360 - 180;
			var lng = 0.1278;
			var color = colors[Math.floor(Math.random() * colors.length)];
			planet.plugins.pings.add(lng, lat, { color: color, ttl: 2000, angle: Math.random() * 10 });*/
			/*if(hideAll){
				for (var i = 0; i < data.length; i++) {
					ignore.push(i);
				}
			}*/
			for (var i = 0; i < data.length; i++) {
				if(ignore.indexOf(i) == -1){
					for (var j = 0; j < data[i].length; j++) {
						var lat = 180 - data[i][j][0];
						var lng = 180 - data[i][j][1];
						var colour = colours[i];
						planet.plugins.pings.add(lng, lat, { color: colour, ttl: 2000, angle: 5 });
					}
				}
			}
		}, 500);
		
		

		//ROTATION
		planet.loadPlugin(autorotate(10));
		planet.projection.scale(175).translate([175, 175]).rotate([0, -10, 0]);
		function autorotate(degPerSec) {
			// Planetary.js plugins are functions that take a `planet` instance as an argument...
			return function(planet) {
			  var lastTick = null;
			  var paused = false;
			  planet.plugins.autorotate = {
				pause:  function() { paused = true;  },
				resume: function() { paused = false; }
			  };
			  // ...and configure hooks into certain pieces of its lifecycle.
			  planet.onDraw(function() {
				if (paused || !lastTick) {
				  lastTick = new Date();
				} else {
				  var now = new Date();
				  var delta = now - lastTick;
				  // This plugin uses the built-in projection (provided by D3)
				  // to rotate the globe each time we draw it.
				  var rotation = planet.projection.rotate();
				  rotation[0] += degPerSec * delta / 1000;
				  if (rotation[0] >= 180) rotation[0] -= 360;
				  planet.projection.rotate(rotation);
				  lastTick = now;
				}
			  });
			};
		};
		
		var size = 300;
		planet.projection.scale(size).translate([size, size]);
		var canvas = document.getElementById('globe');
		planet.draw(canvas);
	}
	createGlobe();