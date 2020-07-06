const React = require('react');
const ReactDOM = require('react-dom');
const axios = require('axios');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {player: {}};
    }

    componentDidMount() {
        axios.get('/api/player').then(result => {
            this.setState({player: result.data});
        });
    }

    render() {
        return (<div>
                <h1> Hello {this.state.player.name}</h1>
            </div>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)