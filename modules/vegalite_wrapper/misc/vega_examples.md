

```json
{
  "$schema": "https://vega.github.io/schema/vega-lite/v2.json",
  "description": "Shows the relationship between horsepower and the numbver of cylinders using tick marks.",
  "data": {
    "url": "data/cars.json"
  },
  "mark": "tick",
  "encoding": {
    "x": {
      "field": "Horsepower",
      "type": "quantitative"
    },
    "y": {
      "field": "Cylinders",
      "type": "ordinal",
      "axis": {
        "grid": true
      }
    }
  },
  "config": {
    "axis": {
      "gridColor": "yellow"
    }
  }
}

```