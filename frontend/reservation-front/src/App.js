
import './App.css';
import {Friends} from "./components/Friends";
import {AddFriend} from "./components/AddFriend";
function App() {
  return (
    <div className="App">
      <AddFriend/>
      <Friends/>
    </div>
  );
}

export default App;
