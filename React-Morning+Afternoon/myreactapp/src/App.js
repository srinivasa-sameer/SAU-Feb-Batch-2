import Books from "./components/Books";
import Header from "./components/Header";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Book from "./components/Book";

function App() {
  return (
    <Router>
      <main>
        <Header />
        <Switch>
          <Route exact path="/">
            <Books />
          </Route>
          <Route path="/book/:id">
            <Book/>
          </Route>
        </Switch>
      </main>
    </Router>
  );
}

export default App;