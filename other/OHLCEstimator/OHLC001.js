Plot.plot({
    y: {
      grid: true,
      inset: 6
    },
    marks: [
      Plot.boxY(morley, {x: "Expt", y: "Speed"})
    ]
  })