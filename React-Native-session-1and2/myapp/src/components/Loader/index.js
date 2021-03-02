import React, { PureComponent } from 'react'
import { ActivityIndicator } from 'react-native'

export default class index extends PureComponent {
    render() {
        return (
            <ActivityIndicator color={'#FF5432'} size={'large'} animating></ActivityIndicator>
        )
    }
}
