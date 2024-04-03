function Hello1() {
    return <h1>Here are a few other things I'd Like to tell you about</h1>;
  }

  const container = document.getElementById('mydiv3');
  const root = ReactDOM.createRoot(container);
  root.render(<Hello1 />)

  /*


> git push origin main:main
error: RPC failed; HTTP 400 curl 92 HTTP/2 stream 7 was not closed cleanly: CANCEL (err 8)
send-pack: unexpected disconnect while reading sideband packet
fatal: the remote end hung up unexpectedly
Everything up-to-date



*/