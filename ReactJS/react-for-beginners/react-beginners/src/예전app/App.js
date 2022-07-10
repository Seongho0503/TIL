import { useEffect, useState } from "react";

function App() {
  const [loading, setLoading] = useState(true);
  const [coins, setCoins] = useState([]);
  const [chosenCoin, setChosenCoin] = useState();
  const [usd, setUsd] = useState(0);
  useEffect(() => {
    fetch("https://api.coinpaprika.com/v1/tickers")
      .then((response) => response.json())
      .then((json) => {
        setCoins(json);
        setChosenCoin(json[1].quotes.USD.price);
        //console.log(json[0].quotes.USD.price);
        setLoading(false);
      });
  }, []);
  const onChange = (event) => {
    console.log(event.target.value);
    setChosenCoin(event.target.value);
  };
  const onChangeUsd = (event) => {
    setUsd(event.target.value);
  };
  return (
    <div className="App">
      <h1>The Coins! {loading ? "" : `${coins.length}`}</h1>
      {loading ? (
        <strong>loading...</strong>
      ) : (
        <div>
          <select onChange={onChange}>
            {coins.map((coin, index) => (
              <option key={coin.id} value={coin.quotes.USD.price}>
                ({index}번 &nbsp; {coin.id}) {coin.name} ({coin.symbol}) :{" "}
                {coin.quotes.USD.price}
              </option>
            ))}
          </select>
          <hr />
          <div>
            USD :{" "}
            <form onChange={onChangeUsd}>
              <input defaultValue={usd}></input>
              <button>ok</button>
            </form>
            result : {usd / chosenCoin}
          </div>
        </div>
      )}
    </div>
  );
}

export default App;
